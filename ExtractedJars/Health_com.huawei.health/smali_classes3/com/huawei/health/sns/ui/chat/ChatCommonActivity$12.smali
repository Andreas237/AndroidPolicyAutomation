.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bnv$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 719
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$12;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/String;I)V
    .locals 8

    .line 724
    const-string v0, "ChatCommonActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setChatVoiceRecorderView voiceFilePath"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " voiceSeconds"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 726
    new-instance v0, Lo/bde;

    invoke-direct {v0}, Lo/bde;-><init>()V

    move-object v1, p1

    move v2, p2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$12;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v3, v3, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->I:Landroid/os/Handler;

    iget-object v4, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$12;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-wide v4, v4, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->f:J

    iget-object v6, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$12;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-boolean v6, v6, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->l:Z

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/bde;->b(Ljava/lang/String;ILandroid/os/Handler;JZZ)V

    .line 728
    return-void
.end method
