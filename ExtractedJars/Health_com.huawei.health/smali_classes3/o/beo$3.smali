.class Lo/beo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/beo;->k(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/beo;

.field final synthetic b:Lo/beu;

.field final synthetic e:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lo/beo$3;->a:Lo/beo;

    iput-object p2, p0, Lo/beo$3;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/beo$3;->b:Lo/beu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 223
    iget-object v0, p0, Lo/beo$3;->a:Lo/beo;

    iget-object v1, p0, Lo/beo$3;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/beo$3;->b:Lo/beu;

    invoke-static {v0, v1, v2}, Lo/beo;->c(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 224
    return-void
.end method
