package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127 (2^8 - 1)
        short s = 32767; // -32,768 ~ 32,767 (2^16 - 1)
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (2^32 - 1)
        long l = 9223372036854775807L; // ~9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (2^64 - 1)

        // 실수
        float f = 3.14159265358979f;
        double d = 3.14159265358979;
    }
}