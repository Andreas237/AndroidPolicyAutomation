.class final Lo/bes$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bes;->h(Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 481
    iput-object p1, p0, Lo/bes$1;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 481
    invoke-virtual {p0, p1}, Lo/bes$1;->d(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Void;
    .locals 2

    .line 486
    invoke-static {}, Lo/aqp;->c()Lo/aqp;

    move-result-object v0

    iget-object v1, p0, Lo/bes$1;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1}, Lo/aqp;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 487
    const/4 v0, 0x0

    return-object v0
.end method
