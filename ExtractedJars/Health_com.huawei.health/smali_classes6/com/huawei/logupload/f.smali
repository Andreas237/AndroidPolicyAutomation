.class public Lcom/huawei/logupload/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final c:Ljava/lang/String; = "LogUpload Service"


# instance fields
.field private a:Lcom/huawei/logupload/LogUpload;

.field private b:I


# direct methods
.method public constructor <init>(Lcom/huawei/logupload/LogUpload;I)V
    .locals 2

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/logupload/f;->b:I

    .line 25
    const-string v0, "LogUpload Service"

    const-string v1, "\u5b9e\u4f8b\u5316\u4e0a\u4f20\u4efb\u52a1"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    iput-object p1, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    .line 27
    iput p2, p0, Lcom/huawei/logupload/f;->b:I

    .line 28
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 32
    const-string v0, "LogUpload Service"

    const-string v1, "\u6267\u884c\u4efb\u52a1"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    if-eqz v0, :cond_b

    .line 41
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mUploadType:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/huawei/logupload/f;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 42
    const-string v2, "CommonConstants.getUploadType():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 43
    invoke-static {}, Lcom/huawei/logupload/c/c;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 41
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    iget v0, p0, Lcom/huawei/logupload/f;->b:I

    if-eqz v0, :cond_0

    .line 45
    invoke-static {}, Lcom/huawei/logupload/c/c;->b()I

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    invoke-static {}, Lcom/huawei/logupload/c/c;->b()I

    move-result v0

    iget v1, p0, Lcom/huawei/logupload/f;->b:I

    if-eq v0, v1, :cond_0

    .line 47
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 48
    return-void

    .line 53
    :cond_0
    invoke-static {}, Lcom/huawei/logupload/c/c;->f()I

    move-result v4

    .line 54
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v0

    and-int/lit8 v5, v0, 0x1

    .line 55
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v0

    and-int/lit8 v6, v0, 0x2

    .line 56
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v0

    and-int/lit8 v7, v0, 0x4

    .line 57
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "networkType "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 58
    const-string v2, "flagWifi "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "flag3g "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 59
    const-string v2, "flag2g "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 57
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 61
    const/4 v0, 0x1

    if-eq v5, v0, :cond_3

    .line 62
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 63
    return-void

    .line 66
    :cond_1
    if-eqz v4, :cond_2

    .line 67
    const/4 v0, 0x2

    if-eq v6, v0, :cond_3

    .line 68
    const/4 v0, 0x4

    if-eq v7, v0, :cond_3

    .line 69
    :cond_2
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 70
    return-void

    .line 74
    :cond_3
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 75
    const-string v0, "LogUpload Service"

    const-string v1, "*****Beta Log Start Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 77
    const-string v0, "LogUpload Service"

    const-string v1, "*****Fans Log Start Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 79
    const-string v0, "LogUpload Service"

    const-string v1, "*****Dev Log Start Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    goto :goto_0

    :cond_6
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_7

    .line 81
    const-string v0, "LogUpload Service"

    const-string v1, "*****FEEDBACK Log Start Upload******"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    :cond_7
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v1}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/String;I)V

    .line 94
    iget v0, p0, Lcom/huawei/logupload/f;->b:I

    if-eqz v0, :cond_8

    .line 95
    iget v0, p0, Lcom/huawei/logupload/f;->b:I

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->a(I)V

    .line 98
    :cond_8
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CommonConstants.getTaskList():"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    const-string v0, "LogUpload Service"

    const-string v1, "\u8fd9\u4e2a\u662f\u6700\u65b0\u65e5\u5fd7\u4e0a\u4f20\u7248\u672c\uff01\uff01\uff01\uff01\uff01"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v0

    const-wide/32 v2, 0xfa000

    cmp-long v0, v0, v2

    if-gez v0, :cond_9

    .line 103
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mLogUploadInfo.getSize() "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 104
    const-string v2, "mLogUploadInfo.getTaskId() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 103
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    const-string v0, "LogUpload Service"

    const-string v1, "\u5c0f\u6587\u4ef6\u4e0a\u4f20 service\u542f\u52a8\u4e0a\u4f20\u7ebf\u7a0b"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-static {v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;)V

    .line 107
    goto/16 :goto_1

    .line 109
    :cond_9
    const-string v0, "LogUpload Service"

    const-string v1, "\u5927\u6587\u4ef6\u4e0a\u4f20 service\u542f\u52a8\u4e0a\u4f20\u7ebf\u7a0b"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mLogUploadInfo.getSize() "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 111
    const-string v2, "mLogUploadInfo.getTaskId() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 110
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->q()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->q()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 114
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u5927\u6587\u4ef6\u4e0a\u4f20  \u5df2\u7ecf\u8bf7\u6c42\u8fc7\u65e5\u5fd7\u670d\u52a1\u5668 path:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/LogUpload;->b(I)V

    .line 116
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-static {v0}, Lcom/huawei/logupload/k;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 117
    goto :goto_1

    .line 119
    :cond_a
    const-string v0, "LogUpload Service"

    const-string v1, "\u5927\u6587\u4ef6\u4e0a\u4f20 \u7b2c\u4e00\u6b21\u4e0a\u4f20"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-static {v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;)V

    .line 124
    :goto_1
    const-string v0, "LogUpload Service"

    const-string v1, "\u6536\u5c3e\u5904\u7406\uff0c\u5224\u65ad\u662f\u5426\u8fd8\u6709\u4efb\u52a1\u5728\u5904\u7406\u4e2d"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    iget-object v0, p0, Lcom/huawei/logupload/f;->a:Lcom/huawei/logupload/LogUpload;

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 151
    :cond_b
    return-void
.end method
