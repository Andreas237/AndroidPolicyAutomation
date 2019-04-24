.class public Lo/xt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/SharedPreferences;

.field private static b:Landroid/content/SharedPreferences$Editor;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;J)J
    .locals 2

    .line 100
    invoke-static {p0}, Lo/xt;->e(Landroid/content/Context;)V

    .line 101
    sget-object v0, Lo/xt;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 67
    invoke-static {p0}, Lo/xt;->e(Landroid/content/Context;)V

    .line 69
    sget-object v0, Lo/xt;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 71
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    :cond_0
    return-object p2

    .line 74
    :cond_1
    return-object v1
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 1

    .line 189
    invoke-static {p0}, Lo/xt;->e(Landroid/content/Context;)V

    .line 190
    sget-object v0, Lo/xt;->b:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 191
    sget-object v0, Lo/xt;->b:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 192
    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .line 125
    invoke-static {p0}, Lo/xt;->e(Landroid/content/Context;)V

    .line 126
    sget-object v0, Lo/xt;->a:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 45
    invoke-static {p0}, Lo/xt;->e(Landroid/content/Context;)V

    .line 46
    sget-object v0, Lo/xt;->b:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 47
    sget-object v0, Lo/xt;->b:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 48
    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;I)I
    .locals 1

    .line 178
    invoke-static {p0}, Lo/xt;->e(Landroid/content/Context;)V

    .line 179
    sget-object v0, Lo/xt;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private static e(Landroid/content/Context;)V
    .locals 2

    .line 32
    const-string v0, "socialsharedpreference"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lo/xt;->a:Landroid/content/SharedPreferences;

    .line 33
    sget-object v0, Lo/xt;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    sput-object v0, Lo/xt;->b:Landroid/content/SharedPreferences$Editor;

    .line 34
    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 1

    .line 112
    invoke-static {p0}, Lo/xt;->e(Landroid/content/Context;)V

    .line 113
    sget-object v0, Lo/xt;->b:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 114
    sget-object v0, Lo/xt;->b:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 115
    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 2

    .line 141
    invoke-static {p0}, Lo/xt;->e(Landroid/content/Context;)V

    .line 142
    sget-object v0, Lo/xt;->b:Landroid/content/SharedPreferences$Editor;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 143
    sget-object v0, Lo/xt;->b:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 144
    return-void
.end method
