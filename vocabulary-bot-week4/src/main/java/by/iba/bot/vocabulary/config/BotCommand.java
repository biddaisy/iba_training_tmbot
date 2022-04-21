package by.iba.bot.vocabulary.config;

/**
 * This enum contains all commands supported by the Telegram bot
 *
 * @author Mikalai Zaikin (nzaikin@iba.by)
 * @since 4Q2021
 */
public enum BotCommand {
    START("Старт"),
    HELP("Помощь"),
    WORD("Показать новое слово сейчас"),
    NOTIFYON("Включить автоматический показ слов"),
    NOTIFYSET("Установить интервал показа новых слов (в минутах)"),
    NOTIFYOFF("Отключить автоматический показ новых слов"),
    WORDSET("Установить количество новых слов в каждом показе"),
    STATUS("Статус вашей бот-сессии"),
    CANCEL("Отмена команды"),
    EXIT("Удалить все данные бот-сессии и прекратить работу"),
    ABOUT("Информация о боте");

    private final String description;

    BotCommand(String desc) {
        description = desc;
    }

    /**
     * Text description of what the command does
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns a command as it must be typed by the user in the chat, i.e. '/start'
     */
    public String getName() {
        return "/" + name().toLowerCase();
    }
}