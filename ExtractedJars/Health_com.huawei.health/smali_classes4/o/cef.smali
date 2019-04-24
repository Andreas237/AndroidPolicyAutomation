.class public Lo/cef;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:I

.field private c:[Landroid/content/Intent;

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x4

    new-array v0, v0, [Landroid/content/Intent;

    iput-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/cef;->d:I

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/cef;->b:I

    .line 38
    const/4 v0, 0x3

    iput v0, p0, Lo/cef;->e:I

    .line 39
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    add-int/lit8 v0, p1, 0x1

    new-array v0, v0, [Landroid/content/Intent;

    iput-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lo/cef;->d:I

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lo/cef;->b:I

    .line 30
    iput p1, p0, Lo/cef;->e:I

    .line 31
    return-void
.end method

.method private b(I)V
    .locals 4

    .line 138
    iget v0, p0, Lo/cef;->b:I

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v1, v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v1, v1

    rem-int v3, v0, v1

    .line 139
    :goto_0
    iget v0, p0, Lo/cef;->d:I

    if-eq v3, v0, :cond_1

    .line 140
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    aget-object v0, v0, v3

    const-string v1, "SPEAK_TYPE"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 141
    goto :goto_1

    .line 144
    :cond_0
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v0, v0

    add-int/2addr v0, v3

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v1, v1

    rem-int v3, v0, v1

    goto :goto_0

    .line 147
    :cond_1
    :goto_1
    add-int/lit8 v0, v3, 0x1

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v1, v1

    rem-int/2addr v0, v1

    iput v0, p0, Lo/cef;->b:I

    .line 151
    return-void
.end method

.method private c(Landroid/content/Intent;)Z
    .locals 3

    .line 336
    const-string v0, "SPEAK_TYPE"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 337
    const/4 v0, 0x3

    if-eq v2, v0, :cond_0

    const/4 v0, 0x5

    if-eq v2, v0, :cond_0

    const/4 v0, 0x4

    if-ne v2, v0, :cond_1

    .line 339
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 341
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private d(Landroid/content/Intent;)Z
    .locals 5

    .line 157
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "action_play_voice"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 158
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 161
    :cond_1
    invoke-virtual {p0}, Lo/cef;->a()I

    move-result v0

    if-nez v0, :cond_2

    .line 163
    const/4 v0, 0x1

    return v0

    .line 166
    :cond_2
    const-string v0, "SPEAK_TYPE"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 169
    iget v0, p0, Lo/cef;->d:I

    iget v1, p0, Lo/cef;->b:I

    if-ge v0, v1, :cond_5

    .line 170
    iget v4, p0, Lo/cef;->d:I

    :goto_0
    iget v0, p0, Lo/cef;->b:I

    if-ge v4, v0, :cond_4

    .line 171
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    aget-object v0, v0, v4

    const-string v1, "SPEAK_TYPE"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v3, :cond_3

    .line 172
    const/4 v0, 0x0

    return v0

    .line 170
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    goto :goto_3

    .line 177
    :cond_5
    iget v4, p0, Lo/cef;->d:I

    :goto_1
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v0, v0

    if-ge v4, v0, :cond_7

    .line 178
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    aget-object v0, v0, v4

    const-string v1, "SPEAK_TYPE"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v3, :cond_6

    .line 179
    const/4 v0, 0x0

    return v0

    .line 177
    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 182
    :cond_7
    const/4 v4, 0x0

    :goto_2
    iget v0, p0, Lo/cef;->b:I

    if-ge v4, v0, :cond_9

    .line 183
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    aget-object v0, v0, v4

    const-string v1, "SPEAK_TYPE"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v3, :cond_8

    .line 184
    const/4 v0, 0x0

    return v0

    .line 182
    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 189
    :cond_9
    :goto_3
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a()I
    .locals 3

    .line 59
    iget v0, p0, Lo/cef;->b:I

    iget v1, p0, Lo/cef;->d:I

    if-le v0, v1, :cond_0

    .line 60
    iget v0, p0, Lo/cef;->b:I

    iget v1, p0, Lo/cef;->d:I

    sub-int/2addr v0, v1

    return v0

    .line 61
    :cond_0
    iget v0, p0, Lo/cef;->d:I

    iget v1, p0, Lo/cef;->b:I

    if-ne v0, v1, :cond_1

    .line 62
    const/4 v0, 0x0

    return v0

    .line 64
    :cond_1
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v0, v0

    iget v1, p0, Lo/cef;->d:I

    iget v2, p0, Lo/cef;->b:I

    sub-int/2addr v1, v2

    sub-int/2addr v0, v1

    return v0
.end method

.method public b()V
    .locals 1

    .line 292
    invoke-virtual {p0}, Lo/cef;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    return-void

    .line 295
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cef;->d:I

    .line 296
    const/4 v0, 0x0

    iput v0, p0, Lo/cef;->b:I

    .line 297
    return-void
.end method

.method public c()Z
    .locals 2

    .line 45
    iget v0, p0, Lo/cef;->b:I

    iget v1, p0, Lo/cef;->d:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 2

    .line 72
    iget v0, p0, Lo/cef;->b:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v1, v1

    rem-int/2addr v0, v1

    iget v1, p0, Lo/cef;->d:I

    if-ne v0, v1, :cond_0

    .line 73
    const/4 v0, 0x1

    return v0

    .line 75
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()Landroid/content/Intent;
    .locals 5

    .line 267
    invoke-virtual {p0}, Lo/cef;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    const-string v0, "Track_VoiceIntentBuffer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The voicebuffer is empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    const/4 v0, 0x0

    return-object v0

    .line 272
    :cond_0
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    iget v1, p0, Lo/cef;->d:I

    aget-object v4, v0, v1

    .line 273
    iget v0, p0, Lo/cef;->d:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v1, v1

    rem-int/2addr v0, v1

    iput v0, p0, Lo/cef;->d:I

    .line 274
    return-object v4
.end method

.method public e(Landroid/content/Intent;)Z
    .locals 4

    .line 85
    invoke-direct {p0, p1}, Lo/cef;->c(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 87
    const-string v0, "SPEAK_TYPE"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 89
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    iget v1, p0, Lo/cef;->d:I

    aput-object p1, v0, v1

    .line 90
    iget v0, p0, Lo/cef;->d:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v1, v1

    rem-int/2addr v0, v1

    iput v0, p0, Lo/cef;->b:I

    goto/16 :goto_0

    .line 93
    :cond_0
    invoke-direct {p0, p1}, Lo/cef;->d(Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 95
    const-string v0, "SPEAK_TYPE"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-direct {p0, v0}, Lo/cef;->b(I)V

    goto/16 :goto_0

    .line 99
    :cond_1
    invoke-virtual {p0}, Lo/cef;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 100
    const-string v0, "Track_VoiceIntentBuffer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The voicebuffer is full!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v0, 0x0

    return v0

    .line 103
    :cond_2
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    iget v1, p0, Lo/cef;->b:I

    aput-object p1, v0, v1

    .line 104
    iget v0, p0, Lo/cef;->b:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v1, v1

    rem-int/2addr v0, v1

    iput v0, p0, Lo/cef;->b:I

    .line 105
    const-string v0, "Track_VoiceIntentBuffer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert voice success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const/4 v0, 0x1

    return v0

    .line 112
    :cond_3
    invoke-virtual {p0}, Lo/cef;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 113
    const-string v0, "Track_VoiceIntentBuffer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The voicebuffer is full!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const/4 v0, 0x0

    return v0

    .line 117
    :cond_4
    invoke-direct {p0, p1}, Lo/cef;->d(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 119
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    iget v1, p0, Lo/cef;->b:I

    aput-object p1, v0, v1

    .line 120
    iget v0, p0, Lo/cef;->b:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v1, v1

    rem-int/2addr v0, v1

    iput v0, p0, Lo/cef;->b:I

    .line 121
    const-string v0, "Track_VoiceIntentBuffer"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert voice success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    const/4 v0, 0x1

    return v0

    .line 127
    :cond_5
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 304
    const-string v4, ""

    .line 305
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Buffer size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cef;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", items num: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/cef;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 307
    invoke-virtual {p0}, Lo/cef;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    return-object v4

    .line 311
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 312
    const-string v0, " voice type:"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    iget v0, p0, Lo/cef;->d:I

    iget v1, p0, Lo/cef;->b:I

    if-ge v0, v1, :cond_2

    .line 314
    iget v6, p0, Lo/cef;->d:I

    :goto_0
    iget v0, p0, Lo/cef;->b:I

    if-ge v6, v0, :cond_1

    .line 316
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    aget-object v1, v1, v6

    const-string v2, "SPEAK_TYPE"

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    goto :goto_3

    .line 320
    :cond_2
    iget v6, p0, Lo/cef;->d:I

    :goto_1
    iget-object v0, p0, Lo/cef;->c:[Landroid/content/Intent;

    array-length v0, v0

    if-ge v6, v0, :cond_3

    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    aget-object v1, v1, v6

    const-string v2, "SPEAK_TYPE"

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 323
    :cond_3
    const/4 v6, 0x0

    :goto_2
    iget v0, p0, Lo/cef;->b:I

    if-ge v6, v0, :cond_4

    .line 324
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cef;->c:[Landroid/content/Intent;

    aget-object v1, v1, v6

    const-string v2, "SPEAK_TYPE"

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 329
    :cond_4
    :goto_3
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 330
    return-object v4
.end method
