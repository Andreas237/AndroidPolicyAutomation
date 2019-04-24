.class public Lcom/ibotta/android/api/ClearCookiesLogOutListener;
.super Ljava/lang/Object;
.source "ClearCookiesLogOutListener.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutListener;


# instance fields
.field private final clearableCookieJar:Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;


# direct methods
.method public constructor <init>(Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/ibotta/android/api/ClearCookiesLogOutListener;->clearableCookieJar:Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;

    return-void
.end method


# virtual methods
.method public onLogOut(Z)V
    .locals 0

    .line 15
    iget-object p1, p0, Lcom/ibotta/android/api/ClearCookiesLogOutListener;->clearableCookieJar:Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;

    invoke-interface {p1}, Lcom/franmontiel/persistentcookiejar/ClearableCookieJar;->clear()V

    return-void
.end method
