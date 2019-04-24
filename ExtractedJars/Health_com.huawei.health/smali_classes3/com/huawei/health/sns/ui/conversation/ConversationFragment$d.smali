.class Lcom/huawei/health/sns/ui/conversation/ConversationFragment$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private c:I

.field private e:Landroid/widget/AbsListView;


# direct methods
.method constructor <init>(Landroid/widget/AbsListView;I)V
    .locals 0

    .line 1213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1214
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$d;->e:Landroid/widget/AbsListView;

    .line 1215
    iput p2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$d;->c:I

    .line 1216
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1221
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$d;->e:Landroid/widget/AbsListView;

    iget v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$d;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setSelection(I)V

    .line 1222
    return-void
.end method
