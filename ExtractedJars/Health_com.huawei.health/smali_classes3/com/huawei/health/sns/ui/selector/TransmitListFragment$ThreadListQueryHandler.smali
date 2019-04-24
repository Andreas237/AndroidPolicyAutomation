.class public final Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;
.super Landroid/content/AsyncQueryHandler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/selector/TransmitListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "ThreadListQueryHandler"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;Landroid/content/ContentResolver;)V
    .locals 0

    .line 963
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;->c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    .line 964
    invoke-direct {p0, p2}, Landroid/content/AsyncQueryHandler;-><init>(Landroid/content/ContentResolver;)V

    .line 965
    return-void
.end method


# virtual methods
.method protected onDeleteComplete(ILjava/lang/Object;I)V
    .locals 0

    .line 983
    return-void
.end method

.method protected onQueryComplete(ILjava/lang/Object;Landroid/database/Cursor;)V
    .locals 2

    .line 970
    const/16 v0, 0x709

    if-ne p1, v0, :cond_0

    .line 972
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$ThreadListQueryHandler;->c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c:Lo/bjm;

    invoke-virtual {v0, p3}, Lo/bjm;->changeCursor(Landroid/database/Cursor;)V

    goto :goto_0

    .line 976
    :cond_0
    const-string v0, "share"

    const-string v1, "onQueryComplete called with unknown token"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 978
    :goto_0
    return-void
.end method
