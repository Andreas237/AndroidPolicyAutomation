.class abstract Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;
.super Ljava/lang/Object;
.source "UserLocalSharePreferences.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/UserLocalSharedPreferences;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "SharedPreferencesEntry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final key:Ljava/lang/String;

.field protected final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TK;)V"
        }
    .end annotation

    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 320
    iput-object p1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;->key:Ljava/lang/String;

    .line 321
    iput-object p2, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;->value:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/String;
    .locals 1

    .line 325
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .line 329
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;->value:Ljava/lang/Object;

    return-object v0
.end method

.method abstract saveWithoutApply(Landroid/content/SharedPreferences$Editor;)V
.end method
