### [My LeetCode Profile](https://leetcode.com/g0rdonL/)

credits to [leetcode-editor](https://github.com/shuzijun/leetcode-editor) intellij plugin
## Progress
<!--START_SECTION_FLAG-->
![LeetCode Stats](https://leetcard.jacoblin.cool/g0rdonL?theme=nord&font=Ubuntu%20Mono)
<!--END_SECTION_FLAG-->

## leetcode-editor config
CodeFileName:
  ```java
  $!velocityTool.camelCaseName(${question.titleSlug})
  ```
CodeTemplate:
  ```java
  package leetcode.editor.en;
  public class $!velocityTool.camelCaseName(${question.titleSlug}){
      public static void main(String[] args) {
           new $!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
      }
      ${question.code}
  }
  ```