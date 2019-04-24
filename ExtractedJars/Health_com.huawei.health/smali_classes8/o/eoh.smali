.class public Lo/eoh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/eoh;


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lo/eoh;->e:Landroid/content/Context;

    .line 35
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/eoh;
    .locals 2

    .line 38
    sget-object v0, Lo/eoh;->a:Lo/eoh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 39
    new-instance v0, Lo/eoh;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eoh;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/eoh;->a:Lo/eoh;

    .line 41
    :cond_0
    sget-object v0, Lo/eoh;->a:Lo/eoh;

    return-object v0
.end method

.method public static c(Landroid/content/Context;I)Ljava/lang/String;
    .locals 1

    .line 209
    invoke-static {p0, p1}, Lo/eoj;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 2

    .line 213
    iget-object v0, p0, Lo/eoh;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 214
    const-string v0, ""

    return-object v0

    .line 216
    :cond_0
    iget-object v0, p0, Lo/eoh;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Lo/eoj;->d(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 248
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, p2, :cond_0

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 251
    :cond_0
    return-object p1
.end method

.method public c([Z)I
    .locals 5

    .line 220
    const-string v0, "AlarmInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRemindWeek()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const/4 v4, 0x0

    .line 222
    const/4 v0, 0x6

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_0

    .line 223
    add-int/lit8 v4, v4, 0x40

    .line 225
    :cond_0
    const/4 v0, 0x5

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_1

    .line 226
    add-int/lit8 v4, v4, 0x20

    .line 228
    :cond_1
    const/4 v0, 0x4

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_2

    .line 229
    add-int/lit8 v4, v4, 0x10

    .line 231
    :cond_2
    const/4 v0, 0x3

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_3

    .line 232
    add-int/lit8 v4, v4, 0x8

    .line 234
    :cond_3
    const/4 v0, 0x2

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_4

    .line 235
    add-int/lit8 v4, v4, 0x4

    .line 237
    :cond_4
    const/4 v0, 0x1

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_5

    .line 238
    add-int/lit8 v4, v4, 0x2

    .line 240
    :cond_5
    const/4 v0, 0x0

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_6

    .line 241
    add-int/lit8 v4, v4, 0x1

    .line 243
    :cond_6
    const-string v0, "AlarmInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRemindWeek() iWeek="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    return v4
.end method

.method public e(III)I
    .locals 2

    .line 262
    sub-int v0, p2, p3

    if-lez v0, :cond_0

    .line 263
    sub-int/2addr p2, p3

    goto :goto_0

    .line 265
    :cond_0
    add-int/lit8 v0, p1, -0x1

    add-int/lit8 v0, v0, 0x18

    rem-int/lit8 p1, v0, 0x18

    .line 266
    sub-int v0, p2, p3

    add-int/lit8 p2, v0, 0x3c

    .line 268
    :goto_0
    mul-int/lit8 v0, p1, 0x64

    add-int/2addr v0, p2

    return v0
.end method
