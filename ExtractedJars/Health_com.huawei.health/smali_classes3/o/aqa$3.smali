.class Lo/aqa$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aqa;->e(Ljava/lang/String;[Ljava/lang/String;JI)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/aqa;

.field final synthetic c:J

.field final synthetic d:[Ljava/lang/String;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/aqa;[Ljava/lang/String;JILjava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lo/aqa$3;->b:Lo/aqa;

    iput-object p2, p0, Lo/aqa$3;->d:[Ljava/lang/String;

    iput-wide p3, p0, Lo/aqa$3;->c:J

    iput p5, p0, Lo/aqa$3;->e:I

    iput-object p6, p0, Lo/aqa$3;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 129
    invoke-virtual {p0, p1}, Lo/aqa$3;->d(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Void;
    .locals 10

    .line 134
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 135
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/aqa$3;->d:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/apm;->b([Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    .line 136
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 138
    if-eqz v9, :cond_3

    .line 141
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 143
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 145
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->getDownloadStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 148
    goto :goto_0

    .line 151
    :cond_0
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 153
    :cond_1
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 156
    iget-object v0, p0, Lo/aqa$3;->b:Lo/aqa;

    invoke-static {v0, v9, v6}, Lo/aqa;->d(Lo/aqa;Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/util/List;)V

    goto :goto_1

    .line 160
    :cond_2
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    :cond_3
    :goto_1
    goto :goto_0

    .line 165
    :cond_4
    new-instance v0, Lo/aqi;

    iget-object v1, p0, Lo/aqa$3;->b:Lo/aqa;

    invoke-static {v1}, Lo/aqa;->d(Lo/aqa;)Lo/apo;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/aqi;-><init>(Lo/apo;)V

    iget-wide v1, p0, Lo/aqa$3;->c:J

    iget v3, p0, Lo/aqa$3;->e:I

    invoke-virtual {v0, v1, v2, v3, v6}, Lo/aqi;->c(JILjava/util/List;)V

    .line 167
    const/4 v8, 0x1

    .line 168
    iget v0, p0, Lo/aqa$3;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 170
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/aqa$3;->c:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->g(J)Z

    move-result v8

    .line 172
    :cond_5
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-wide v1, p0, Lo/aqa$3;->c:J

    iget v3, p0, Lo/aqa$3;->e:I

    iget-object v4, p0, Lo/aqa$3;->a:Ljava/lang/String;

    move v5, v8

    invoke-virtual/range {v0 .. v5}, Lo/apz;->b(JILjava/lang/String;Z)V

    .line 173
    const/4 v0, 0x0

    return-object v0
.end method
