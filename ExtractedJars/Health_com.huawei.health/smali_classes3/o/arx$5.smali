.class final Lo/arx$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arx;->a(Lo/arx;I)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/arx;

.field final synthetic c:I


# direct methods
.method constructor <init>(ILo/arx;)V
    .locals 0

    .line 135
    iput p1, p0, Lo/arx$5;->c:I

    iput-object p2, p0, Lo/arx$5;->b:Lo/arx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 135
    invoke-virtual {p0, p1}, Lo/arx$5;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 140
    new-instance v1, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;

    invoke-direct {v1}, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;-><init>()V

    .line 141
    iget v0, p0, Lo/arx$5;->c:I

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/logic/complain/GetComplainCategoryRequest;->setTypeData(I)V

    .line 143
    invoke-static {v1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v2

    .line 145
    iget-object v0, p0, Lo/arx$5;->b:Lo/arx;

    invoke-virtual {v0, v2}, Lo/arx;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 146
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
