.class public Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidationImpl;
.super Ljava/lang/Object;
.source "ImLoginValidationImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isEmailValid(Ljava/lang/String;)Z
    .locals 0

    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isPasswordValid(Ljava/lang/String;)Z
    .locals 0

    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
