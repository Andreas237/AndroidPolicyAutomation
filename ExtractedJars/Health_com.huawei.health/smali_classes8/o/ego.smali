.class public Lo/ego;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ego$a;
    }
.end annotation


# static fields
.field private static c:Z

.field private static d:Landroid/graphics/drawable/AnimationDrawable;

.field private static final e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/ego;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 41
    sget v0, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 38
    return-void
.end method

.method static synthetic a()Z
    .locals 1

    .line 28
    sget-boolean v0, Lo/ego;->c:Z

    return v0
.end method

.method public static b(Landroid/content/Context;F)I
    .locals 3

    .line 240
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 241
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private b(Z)V
    .locals 0

    .line 54
    sput-boolean p1, Lo/ego;->c:Z

    .line 55
    return-void
.end method

.method static synthetic c(Landroid/graphics/drawable/AnimationDrawable;)Landroid/graphics/drawable/AnimationDrawable;
    .locals 0

    .line 28
    sput-object p0, Lo/ego;->d:Landroid/graphics/drawable/AnimationDrawable;

    return-object p0
.end method


# virtual methods
.method public dismiss()V
    .locals 3

    .line 228
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 229
    sget-object v1, Lo/ego;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 230
    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0}, Lo/ego;->b(Z)V

    .line 231
    sget-object v0, Lo/ego;->d:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    sget-object v0, Lo/ego;->d:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 232
    sget-object v0, Lo/ego;->d:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 233
    const/4 v0, 0x0

    sput-object v0, Lo/ego;->d:Landroid/graphics/drawable/AnimationDrawable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 237
    :goto_0
    return-void
.end method

.method public show()V
    .locals 1

    .line 220
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 221
    sget-object v0, Lo/ego;->d:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 222
    sget-object v0, Lo/ego;->d:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 224
    :cond_0
    return-void
.end method
