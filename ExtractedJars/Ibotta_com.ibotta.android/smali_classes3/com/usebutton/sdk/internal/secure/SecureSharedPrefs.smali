.class Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;
.super Ljava/lang/Object;
.source "SecureSharedPrefs.java"


# static fields
.field private static final PREFS_NAME:Ljava/lang/String; = "btn_secure_prefs"


# instance fields
.field private final preferences:Landroid/content/SharedPreferences;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "btn_secure_prefs"

    const/4 v1, 0x0

    .line 24
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->preferences:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method clear()V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public deleteString(Ljava/lang/String;)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->preferences:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hasString(Ljava/lang/String;)Z
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public saveString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 34
    iget-object v0, p0, Lcom/usebutton/sdk/internal/secure/SecureSharedPrefs;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
