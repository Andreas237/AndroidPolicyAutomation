.class public Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;
.super Ljava/lang/Object;
.source "ReceiptSubmissionHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/submission/ReceiptSubmissionHelper;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final SUBMISSION_ID_FORMAT:Ljava/lang/String; = "%1$d-%2$s"


# instance fields
.field private submissionId:Ljava/lang/String;

.field private final userState:Lcom/ibotta/android/state/user/UserState;

.field private final uuidGenerator:Lcom/ibotta/android/util/UuidGenerator;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/UuidGenerator;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;->uuidGenerator:Lcom/ibotta/android/util/UuidGenerator;

    return-void
.end method

.method private generateSubmissionId()V
    .locals 5

    const-string v0, "%1$d-%2$s"

    const/4 v1, 0x2

    .line 44
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;->uuidGenerator:Lcom/ibotta/android/util/UuidGenerator;

    invoke-virtual {v2}, Lcom/ibotta/android/util/UuidGenerator;->generateUuid()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;->submissionId:Ljava/lang/String;

    const-string v0, "Submission ID generated: %1$s"

    .line 45
    new-array v1, v4, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;->submissionId:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getSubmissionId()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;->submissionId:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 40
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;->startSubmission()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public startSubmission()Ljava/lang/String;
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;->generateSubmissionId()V

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/submission/ReceiptSubmissionHelperImpl;->submissionId:Ljava/lang/String;

    return-object v0
.end method
