# Don't use the provided private and public keys in your Production Environment
# For TESTING PURPOSES ONLY!!!
# Generate your own Keys!

# openssl-java-encrypt-decrypt
Java Console using OpenSSL to Encrypt and Decrypt.

In addition, it's using openssl to generate public/private keys which a Java application can use.

OpenSSL Generate the Private Key
# Generate private key with pkcs8 encoding
openssl genpkey -out private_key_rsa_4096_pkcs8-generated.pem -algorithm RSA -pkeyopt rsa_keygen_bits:4096

Example:
C:\tmp\OpenSSL-1.1.1h_win32>openssl.exe genpkey -out private_key_rsa_4096_pkcs8-generated.pem -algorithm RSA -pkeyopt rsa_keygen_bits:4096
...................................++++
............++++

OpenSSL Generate the Public Key
# Export public key in pkcs8 format
openssl rsa -pubout -outform pem -in private_key_rsa_4096_pkcs8-generated.pem -out public_key_rsa_4096_pkcs8-exported.pem

Example:
C:\tmp\OpenSSL-1.1.1h_win32>openssl.exe rsa -pubout -outform pem -in private_key_rsa_4096_pkcs8-generated.pem -out public_key_rsa_4096_pkcs8-exported.pem
writing RSA key

Have a look **Rsa4096Demo.java**

Note:
The private and public key files. Remember, these files were generated by OpenSSL. 
You put them in the project's src/test/resources/ directory so they would appear in the Class Path. 

Original code: https://github.com/mjremijan/thoth-rsa

This program is tested and run on 
Product Version: Apache NetBeans IDE 11.1
Java: 11.0.9; OpenJDK 64-Bit Server VM 11.0.9+11-LTS
Runtime: OpenJDK Runtime Environment 11.0.9+11-LTS
System: Windows 10 version 10.0 running on amd64; Cp1252; en_AU (nb)
