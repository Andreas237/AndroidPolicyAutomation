.class public Lcom/ibotta/android/tracking/proprietary/persistence/sharedprefs/SharedPrefsLastKeyPersistence;
.super Ljava/lang/Object;
.source "SharedPrefsLastKeyPersistence.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/tracking/proprietary/persistence/SingleValuePersistence<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field private static final LAST_KEY:Ljava/lang/String; = "LAST_KEY"


# instance fields
.field private final sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/persistence/sharedprefs/SharedPrefsLastKeyPersistence;->sharedPreferences:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public delete()V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/sharedprefs/SharedPrefsLastKeyPersistence;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public read()Ljava/lang/Integer;
    .locals 3

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/sharedprefs/SharedPrefsLastKeyPersistence;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "LAST_KEY"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic read()Ljava/lang/Object;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/persistence/sharedprefs/SharedPrefsLastKeyPersistence;->read()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public write(Ljava/lang/Integer;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/sharedprefs/SharedPrefsLastKeyPersistence;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "LAST_KEY"

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method public bridge synthetic write(Ljava/lang/Object;)V
    .locals 0

    .line 7
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/proprietary/persistence/sharedprefs/SharedPrefsLastKeyPersistence;->write(Ljava/lang/Integer;)V

    return-void
.end method
