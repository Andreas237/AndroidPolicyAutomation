.class public Lcom/ibotta/android/state/app/google/GoogleStateImpl;
.super Ljava/lang/Object;
.source "GoogleStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/google/GoogleState;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field protected static final KEY_GOOGLE_AID:Ljava/lang/String; = "google_aid"


# instance fields
.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/state/app/google/GoogleStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public getGoogleAID()Ljava/lang/String;
    .locals 3

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/state/app/google/GoogleStateImpl;->prefs:Landroid/content/SharedPreferences;

    const-string v1, "google_aid"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/state/app/google/GoogleStateImpl;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public setGoogleAID(Ljava/lang/String;)V
    .locals 3

    const-string v0, "Saving Google AID: %1$s"

    const/4 v1, 0x1

    .line 32
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/state/app/google/GoogleStateImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "google_aid"

    .line 34
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 35
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
