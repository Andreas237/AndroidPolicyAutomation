.class Lcom/huawei/health/sns/server/im/SNSIMCenter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/azu;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/im/SNSIMCenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/server/im/SNSIMCenter;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V
    .locals 0

    .line 685
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$1;->e:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 1

    .line 689
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$1;->e:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c(Lcom/huawei/health/sns/server/im/SNSIMCenter;)Lo/azi;

    move-result-object v0

    invoke-virtual {v0}, Lo/azi;->a()V

    .line 690
    return-void
.end method
