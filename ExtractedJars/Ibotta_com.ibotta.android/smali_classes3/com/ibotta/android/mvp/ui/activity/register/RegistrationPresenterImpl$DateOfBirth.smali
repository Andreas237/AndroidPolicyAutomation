.class Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;
.super Ljava/lang/Object;
.source "RegistrationPresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DateOfBirth"
.end annotation


# instance fields
.field dateOfBirthDayOfMonth:I

.field dateOfBirthMonth:I

.field dateOfBirthYear:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 404
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 405
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;->dateOfBirthYear:I

    .line 406
    iput p2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;->dateOfBirthMonth:I

    .line 407
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;->dateOfBirthDayOfMonth:I

    return-void
.end method
