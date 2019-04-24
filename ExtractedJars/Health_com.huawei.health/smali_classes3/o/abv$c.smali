.class Lo/abv$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:I

.field private d:I


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    const/4 v0, -0x1

    iput v0, p0, Lo/abv$c;->d:I

    .line 149
    const/4 v0, 0x0

    iput v0, p0, Lo/abv$c;->c:I

    .line 150
    iput-object p1, p0, Lo/abv$c;->b:Landroid/content/Context;

    .line 152
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lo/abv$3;)V
    .locals 0

    .line 140
    invoke-direct {p0, p1}, Lo/abv$c;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method private d(I)Z
    .locals 6

    .line 156
    iget v0, p0, Lo/abv$c;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 157
    iget-object v0, p0, Lo/abv$c;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->g(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v4

    .line 159
    if-eqz v4, :cond_0

    array-length v0, v4

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    .line 161
    const/4 v0, 0x1

    :try_start_0
    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/abv$c;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    goto :goto_0

    .line 162
    :catch_0
    move-exception v5

    .line 163
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " isAvaliableReport Exception"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    :cond_0
    :goto_0
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAvaliableReport,baseStep=:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/abv$c;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",SensorChangedstep=:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    iget v0, p0, Lo/abv$c;->d:I

    if-lt p1, v0, :cond_1

    iget v0, p0, Lo/abv$c;->d:I

    sub-int v0, p1, v0

    const v1, 0x186a0

    if-le v0, v1, :cond_3

    .line 170
    :cond_1
    iget v0, p0, Lo/abv$c;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/abv$c;->c:I

    .line 171
    const-string v0, "Step_StandStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAvaliableReport,wrong data count=:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/abv$c;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",baseStep=:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/abv$c;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",wrongstep=:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    iget v0, p0, Lo/abv$c;->c:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_2

    .line 173
    const/4 v0, 0x0

    iput v0, p0, Lo/abv$c;->c:I

    .line 174
    iput p1, p0, Lo/abv$c;->d:I

    .line 175
    const/4 v0, 0x0

    return v0

    .line 177
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 179
    :cond_3
    iget v0, p0, Lo/abv$c;->c:I

    if-eqz v0, :cond_4

    .line 180
    const/4 v0, 0x0

    iput v0, p0, Lo/abv$c;->c:I

    .line 182
    :cond_4
    iput p1, p0, Lo/abv$c;->d:I

    .line 183
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lo/abv$c;I)Z
    .locals 1

    .line 140
    invoke-direct {p0, p1}, Lo/abv$c;->d(I)Z

    move-result v0

    return v0
.end method
