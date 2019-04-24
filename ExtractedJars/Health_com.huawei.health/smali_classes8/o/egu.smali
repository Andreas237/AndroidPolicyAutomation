.class public Lo/egu;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egu$a;
    }
.end annotation


# static fields
.field private static a:Z

.field private static final c:Ljava/lang/Object;

.field private static d:Landroid/graphics/drawable/AnimationDrawable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/egu;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 39
    sget v0, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 36
    return-void
.end method

.method static synthetic d(Landroid/graphics/drawable/AnimationDrawable;)Landroid/graphics/drawable/AnimationDrawable;
    .locals 0

    .line 26
    sput-object p0, Lo/egu;->d:Landroid/graphics/drawable/AnimationDrawable;

    return-object p0
.end method

.method static synthetic d()Z
    .locals 1

    .line 26
    sget-boolean v0, Lo/egu;->a:Z

    return v0
.end method

.method public static e(Landroid/content/Context;F)I
    .locals 3

    .line 295
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 296
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private e(Z)V
    .locals 0

    .line 52
    sput-boolean p1, Lo/egu;->a:Z

    .line 53
    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 3

    .line 283
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 284
    sget-object v1, Lo/egu;->c:Ljava/lang/Object;

    monitor-enter v1

    .line 285
    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0}, Lo/egu;->e(Z)V

    .line 286
    sget-object v0, Lo/egu;->d:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    sget-object v0, Lo/egu;->d:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 287
    sget-object v0, Lo/egu;->d:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 288
    const/4 v0, 0x0

    sput-object v0, Lo/egu;->d:Landroid/graphics/drawable/AnimationDrawable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 292
    :goto_0
    return-void
.end method

.method public show()V
    .locals 1

    .line 275
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 276
    sget-object v0, Lo/egu;->d:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 277
    sget-object v0, Lo/egu;->d:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 279
    :cond_0
    return-void
.end method
