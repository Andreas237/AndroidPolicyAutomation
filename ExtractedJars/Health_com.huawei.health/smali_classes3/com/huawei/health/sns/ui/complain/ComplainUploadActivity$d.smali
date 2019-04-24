.class Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V
    .locals 0

    .line 435
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$2;)V
    .locals 0

    .line 435
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)V

    return-void
.end method

.method private d(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 483
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 484
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_0

    const/16 v3, 0x64

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 485
    :goto_0
    const/4 v4, 0x0

    :goto_1
    if-le v3, v4, :cond_1

    .line 487
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 485
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 489
    :cond_1
    return-object v2
.end method

.method private e(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 499
    invoke-static {}, Lo/apl;->d()Lo/apl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apl;->e(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 435
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 440
    const/4 v3, 0x0

    .line 442
    invoke-static {}, Lo/apl;->d()Lo/apl;

    move-result-object v0

    invoke-virtual {v0}, Lo/apl;->c()V

    .line 443
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 445
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    const/4 v1, 0x3

    invoke-static {v0, v1, v3}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->c(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;II)V

    .line 446
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 449
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_1

    .line 451
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->c(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;II)V

    .line 452
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->b(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 454
    :cond_1
    invoke-static {}, Lo/apl;->d()Lo/apl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/apl;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 457
    invoke-static {}, Lo/apl;->d()Lo/apl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/apl;->b(Ljava/util/ArrayList;)I

    move-result v3

    .line 459
    const/4 v0, -0x3

    if-ne v3, v0, :cond_2

    .line 462
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    const/4 v1, 0x3

    invoke-static {v0, v1, v3}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->c(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;II)V

    .line 463
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 465
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 467
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    const/4 v1, 0x3

    invoke-static {v0, v1, v3}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->c(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;II)V

    .line 468
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 471
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->e(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v4

    .line 473
    invoke-static {}, Lo/apl;->d()Lo/apl;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/apl;->c(Ljava/lang/String;)I

    move-result v5

    .line 474
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity$d;->c:Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    const/4 v1, 0x3

    invoke-static {v0, v1, v5}, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;->c(Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;II)V

    .line 475
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
