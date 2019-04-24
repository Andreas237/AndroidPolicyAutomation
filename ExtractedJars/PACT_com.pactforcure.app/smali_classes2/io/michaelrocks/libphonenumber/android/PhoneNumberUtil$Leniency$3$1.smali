.class Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency$3$1;
.super Ljava/lang/Object;
.source "PhoneNumberUtil.java"

# interfaces
.implements Lio/michaelrocks/libphonenumber/android/PhoneNumberMatcher$NumberGroupingChecker;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency$3;->verify(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency$3;


# direct methods
.method constructor <init>(Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency$3;)V
    .locals 0
    .param p1, "this$0"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency$3;

    .prologue
    .line 504
    iput-object p1, p0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency$3$1;->this$0:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public checkGroups(Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/StringBuilder;[Ljava/lang/String;)Z
    .locals 1
    .param p1, "util"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;
    .param p2, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p3, "normalizedCandidate"    # Ljava/lang/StringBuilder;
    .param p4, "expectedNumberGroups"    # [Ljava/lang/String;

    .prologue
    .line 509
    invoke-static {p1, p2, p3, p4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberMatcher;->allNumberGroupsRemainGrouped(Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/StringBuilder;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
