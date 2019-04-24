.class Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 375
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;)V
    .locals 0

    .line 375
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$e;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 375
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$e;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 1

    .line 380
    invoke-static {}, Lo/apl;->d()Lo/apl;

    move-result-object v0

    invoke-virtual {v0}, Lo/apl;->c()V

    .line 381
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
