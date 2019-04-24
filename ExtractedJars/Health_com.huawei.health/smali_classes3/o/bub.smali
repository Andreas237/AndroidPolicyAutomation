.class public Lo/bub;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[I

.field private b:[I

.field private c:[Ljava/lang/String;

.field private d:[Ljava/lang/String;

.field private e:[Ljava/lang/String;

.field private h:[Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_run_workout_names:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bub;->d:[Ljava/lang/String;

    .line 21
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 27
    :cond_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_5km_10km_workout_desc_km:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bub;->c:[Ljava/lang/String;

    .line 28
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_5km_10km_workout_desc_3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v0

    iput-object v0, p0, Lo/bub;->b:[I

    .line 29
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_5km_10km_workout_desc_4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v0

    iput-object v0, p0, Lo/bub;->a:[I

    .line 30
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_5km_10km_week_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bub;->e:[Ljava/lang/String;

    .line 31
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_5km_10km_week_sentence:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bub;->h:[Ljava/lang/String;

    goto :goto_0

    .line 38
    :cond_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_mathon_workout_desc_km:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bub;->c:[Ljava/lang/String;

    .line 39
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_mathon_workout_desc_3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v0

    iput-object v0, p0, Lo/bub;->b:[I

    .line 40
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_mathon_workout_desc_4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v0

    iput-object v0, p0, Lo/bub;->a:[I

    .line 41
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_marathon_week_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bub;->e:[Ljava/lang/String;

    .line 42
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_marathon_week_sentence:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bub;->h:[Ljava/lang/String;

    .line 44
    :goto_0
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    .line 97
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bub;->b:[I

    array-length v0, v0

    if-lt v0, p1, :cond_0

    .line 98
    iget-object v0, p0, Lo/bub;->b:[I

    aget v0, v0, p1

    return v0

    .line 100
    :cond_0
    iget-object v0, p0, Lo/bub;->b:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public b(I)Ljava/lang/String;
    .locals 1

    .line 56
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bub;->c:[Ljava/lang/String;

    array-length v0, v0

    if-gt v0, p1, :cond_1

    .line 57
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 59
    :cond_1
    iget-object v0, p0, Lo/bub;->c:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public c(I)Ljava/lang/String;
    .locals 1

    .line 48
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bub;->d:[Ljava/lang/String;

    array-length v0, v0

    if-lt p1, v0, :cond_1

    .line 49
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 51
    :cond_1
    iget-object v0, p0, Lo/bub;->d:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public d(I)I
    .locals 2

    .line 105
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bub;->a:[I

    array-length v0, v0

    if-lt v0, p1, :cond_0

    .line 106
    iget-object v0, p0, Lo/bub;->a:[I

    aget v0, v0, p1

    return v0

    .line 108
    :cond_0
    iget-object v0, p0, Lo/bub;->a:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public e(I)Ljava/lang/String;
    .locals 1

    .line 113
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bub;->e:[Ljava/lang/String;

    array-length v0, v0

    if-gt v0, p1, :cond_1

    .line 114
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 116
    :cond_1
    iget-object v0, p0, Lo/bub;->e:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public k(I)Ljava/lang/String;
    .locals 1

    .line 121
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bub;->h:[Ljava/lang/String;

    array-length v0, v0

    if-gt v0, p1, :cond_1

    .line 122
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 124
    :cond_1
    iget-object v0, p0, Lo/bub;->h:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method
