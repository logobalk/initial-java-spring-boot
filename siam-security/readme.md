# SIAM-Security
A Security Adapter for Spring 

## How to setup ?
    
  1. Add **SIAM-Security** into workspace project.

     ```sh
     $ cd <your workspace>
     $ git submodule add git@10.1.99.41:development/utilities/siam-security.git
     ```

  2. Commit submodule
     
     Add `siam-security` folder into Git commit.

     Example :
     ```sh
     $ git add siam-security .gitsubmodule
     $ git commit -m "add siam-security submodule"
     ```

  3. Insert POM dependency
     
     ```pom
     <dependency>
       <groupId>com.siampharm.core</groupId>
       <artifactId>siam-security</artifactId>
       <version>0.0.1-SNAPSHOT</version>
     </dependency>
     ```

     > Note : Version can be changed. Look in `pom.xml`.

  4. Install / Update Repository into local
  
     ```sh
     $ mvn clean install
     ```

## How to update `SIAM-Security` submodule?

    It's EZzzzz.
    
     ```
     $ git submodule sync
     $ git submodule update  --init --recursive --force
     ```
