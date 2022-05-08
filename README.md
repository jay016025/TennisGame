### Teniss Game README ###

* 此專案作為TDD練習
* TDD 實作步驟
  - 討論出用者案例(User Case)
  - 定義出需要的測試案例(Testing Case)

* Test Case
  1. 撰寫測試案例
  2. 撰寫正式程式
  3. 重構測試、正式程式碼
  4. 以上三步驟重複進行(loop)

***將測試程式看做跟正式程式一樣重要***

---

#### Tennis Game 需求 ####

需實作一個簡單的網球遊戲，單場賽制。

評分系統為以下 :
- 有兩位玩家，每位玩家的得分項目為 : 0(love)、1(fifteen)、2(thirteen)、3(forty)
- 先得到4分且比對手多至少兩分者贏得比賽。
- 特殊規則:
  * 如兩位玩家皆得分 forty，為 deuce。
  * deuce 後，任一玩家得分，為 advantage。
  * advantage 方玩家繼續得分，則贏得比賽。

---

#### Tennis Game 使用者案例 ####

- love all
- fifteen all
- fifteen love
- fifteen thirteen
- deuce
- First player win
- Second player win
- First player advantage
- Second player advantage
- Advantage after first player win
- Advantage after second player win

---