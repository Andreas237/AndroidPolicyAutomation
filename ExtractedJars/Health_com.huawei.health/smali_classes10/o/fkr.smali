.class public Lo/fkr;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fkr$d;
    }
.end annotation


# static fields
.field private static d:Lo/fkr;


# instance fields
.field private b:Landroid/content/SharedPreferences;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fkr$1;)V
    .locals 0

    invoke-direct {p0}, Lo/fkr;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/fkr;
    .locals 3

    if-nez p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    sget-object v0, Lo/fkr;->d:Lo/fkr;

    if-nez v0, :cond_1

    invoke-static {}, Lo/fkr$d;->d()Lo/fkr;

    move-result-object v0

    sput-object v0, Lo/fkr;->d:Lo/fkr;

    sget-object v0, Lo/fkr;->d:Lo/fkr;

    const-string v1, "com.zhangyue.iReader.sdk.scheme.SharedPreferences"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, v0, Lo/fkr;->b:Landroid/content/SharedPreferences;

    :cond_1
    sget-object v0, Lo/fkr;->d:Lo/fkr;

    return-object v0
.end method


# virtual methods
.method public d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/fkr;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lo/fkr;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v1

    const/4 v0, 0x0

    return v0
.end method
