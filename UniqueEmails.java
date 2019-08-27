class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmails = new HashSet<>();
        for(int i = 0; i < emails.length; i++){
            int endOfLocal = emails[i].indexOf('@');
            uniqueEmails.add(cleanEmail(emails[i].substring(0, endOfLocal)) + emails[i].substring(endOfLocal, emails[i].length()));
        }
        return uniqueEmails.size();
    }
    
    private String cleanEmail(String email){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '+') break;
            if(email.charAt(i) != '.') sb.append(email.charAt(i));
            
        }
        return sb.toString();
    }
}
