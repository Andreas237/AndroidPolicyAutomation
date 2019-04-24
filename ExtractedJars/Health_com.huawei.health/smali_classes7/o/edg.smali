.class public final Lo/edg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final b:I

.field private static final c:Ljava/lang/String;

.field private static e:Lo/edg;


# instance fields
.field private final a:Lo/edc;

.field private final d:Landroid/content/Context;

.field private f:Landroid/graphics/Rect;

.field private g:Landroid/hardware/Camera;

.field private h:Landroid/graphics/Rect;

.field private i:Z

.field private k:Z

.field private final m:Lo/edj;

.field private final n:Z

.field private final p:Lo/ede;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 19
    const-class v0, Lo/edg;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/edg;->c:Ljava/lang/String;

    .line 36
    :try_start_0
    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Lo/ecw;->b(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 40
    goto :goto_0

    .line 37
    :catch_0
    move-exception v2

    .line 39
    const/16 v1, 0x2710

    .line 41
    :goto_0
    sput v1, Lo/edg;->b:I

    .line 42
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Lo/edg;->d:Landroid/content/Context;

    .line 76
    new-instance v0, Lo/edc;

    invoke-direct {v0, p1}, Lo/edc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/edg;->a:Lo/edc;

    .line 77
    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Lo/ecw;->b(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/edg;->n:Z

    .line 78
    new-instance v0, Lo/edj;

    iget-object v1, p0, Lo/edg;->a:Lo/edc;

    iget-boolean v2, p0, Lo/edg;->n:Z

    invoke-direct {v0, v1, v2}, Lo/edj;-><init>(Lo/edc;Z)V

    iput-object v0, p0, Lo/edg;->m:Lo/edj;

    .line 79
    new-instance v0, Lo/ede;

    invoke-direct {v0}, Lo/ede;-><init>()V

    iput-object v0, p0, Lo/edg;->p:Lo/ede;

    .line 80
    return-void
.end method

.method public static a()Lo/edg;
    .locals 3

    .line 83
    const-class v1, Lo/edg;

    monitor-enter v1

    .line 84
    :try_start_0
    sget-object v0, Lo/edg;->e:Lo/edg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 85
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static e(Landroid/content/Context;)V
    .locals 4

    .line 65
    const-class v2, Lo/edg;

    monitor-enter v2

    .line 66
    :try_start_0
    sget-object v0, Lo/edg;->e:Lo/edg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 67
    new-instance v0, Lo/edg;

    invoke-direct {v0, p0}, Lo/edg;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/edg;->e:Lo/edg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 70
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;I)V
    .locals 2

    .line 162
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lo/edg;->i:Z

    if-eqz v0, :cond_1

    .line 163
    iget-object v0, p0, Lo/edg;->m:Lo/edj;

    invoke-virtual {v0, p1, p2}, Lo/edj;->d(Landroid/os/Handler;I)V

    .line 164
    iget-boolean v0, p0, Lo/edg;->n:Z

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    iget-object v1, p0, Lo/edg;->m:Lo/edj;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setOneShotPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    goto :goto_0

    .line 167
    :cond_0
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    iget-object v1, p0, Lo/edg;->m:Lo/edj;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 170
    :cond_1
    :goto_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 146
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/edg;->i:Z

    if-nez v0, :cond_0

    .line 147
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    .line 148
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/edg;->i:Z

    .line 150
    :cond_0
    return-void
.end method

.method public b(Landroid/view/SurfaceHolder;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    if-nez v0, :cond_2

    .line 99
    invoke-static {}, Landroid/hardware/Camera;->open()Landroid/hardware/Camera;

    move-result-object v0

    iput-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    .line 100
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    .line 101
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 103
    :cond_0
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    .line 105
    iget-boolean v0, p0, Lo/edg;->k:Z

    if-nez v0, :cond_1

    .line 106
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/edg;->k:Z

    .line 107
    iget-object v0, p0, Lo/edg;->a:Lo/edc;

    iget-object v1, p0, Lo/edg;->g:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Lo/edc;->e(Landroid/hardware/Camera;)V

    .line 109
    :cond_1
    iget-object v0, p0, Lo/edg;->a:Lo/edc;

    iget-object v1, p0, Lo/edg;->g:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Lo/edc;->a(Landroid/hardware/Camera;)V

    .line 111
    :cond_2
    return-void
.end method

.method public c()V
    .locals 3

    .line 131
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lo/edg;->i:Z

    if-eqz v0, :cond_1

    .line 132
    iget-boolean v0, p0, Lo/edg;->n:Z

    if-nez v0, :cond_0

    .line 133
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    .line 135
    :cond_0
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 136
    iget-object v0, p0, Lo/edg;->m:Lo/edj;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/edj;->d(Landroid/os/Handler;I)V

    .line 137
    iget-object v0, p0, Lo/edg;->p:Lo/ede;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ede;->c(Landroid/os/Handler;I)V

    .line 138
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/edg;->i:Z

    .line 140
    :cond_1
    return-void
.end method

.method public d()V
    .locals 1

    .line 90
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    .line 94
    :cond_0
    return-void
.end method

.method public e([BII)Lo/edk;
    .locals 11

    .line 207
    invoke-virtual {p0}, Lo/edg;->g()Landroid/graphics/Rect;

    move-result-object v8

    .line 208
    iget-object v0, p0, Lo/edg;->a:Lo/edc;

    invoke-virtual {v0}, Lo/edc;->e()I

    move-result v9

    .line 209
    iget-object v0, p0, Lo/edg;->a:Lo/edc;

    invoke-virtual {v0}, Lo/edc;->a()Ljava/lang/String;

    move-result-object v10

    .line 210
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    .line 213
    :sswitch_0
    new-instance v0, Lo/edk;

    iget v4, v8, Landroid/graphics/Rect;->left:I

    iget v5, v8, Landroid/graphics/Rect;->top:I

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v6

    .line 214
    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    move-result v7

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v7}, Lo/edk;-><init>([BIIIIII)V

    .line 213
    return-object v0

    .line 216
    :goto_0
    const-string v0, "yuv420p"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    new-instance v0, Lo/edk;

    iget v4, v8, Landroid/graphics/Rect;->left:I

    iget v5, v8, Landroid/graphics/Rect;->top:I

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v6

    .line 218
    invoke-virtual {v8}, Landroid/graphics/Rect;->height()I

    move-result v7

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v7}, Lo/edk;-><init>([BIIIIII)V

    .line 217
    return-object v0

    .line 221
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported picture format: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x2f

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_0
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public e()V
    .locals 3

    .line 118
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lo/edg;->a:Lo/edc;

    iget-object v1, p0, Lo/edg;->g:Landroid/hardware/Camera;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/edc;->d(Landroid/hardware/Camera;Z)V

    .line 121
    :cond_0
    return-void
.end method

.method public e(Landroid/os/Handler;I)V
    .locals 2

    .line 155
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/edg;->i:Z

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lo/edg;->p:Lo/ede;

    invoke-virtual {v0, p1, p2}, Lo/ede;->c(Landroid/os/Handler;I)V

    .line 157
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    iget-object v1, p0, Lo/edg;->p:Lo/ede;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    .line 159
    :cond_0
    return-void
.end method

.method public g()Landroid/graphics/Rect;
    .locals 6

    .line 225
    iget-object v0, p0, Lo/edg;->f:Landroid/graphics/Rect;

    if-nez v0, :cond_1

    .line 226
    invoke-virtual {p0}, Lo/edg;->i()Landroid/graphics/Rect;

    move-result-object v2

    .line 227
    const/4 v3, 0x0

    .line 228
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 229
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    goto :goto_0

    .line 231
    :cond_0
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, v2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 234
    :goto_0
    iget-object v0, p0, Lo/edg;->a:Lo/edc;

    invoke-virtual {v0}, Lo/edc;->b()Landroid/graphics/Point;

    move-result-object v4

    .line 235
    iget-object v0, p0, Lo/edg;->a:Lo/edc;

    invoke-virtual {v0}, Lo/edc;->d()Landroid/graphics/Point;

    move-result-object v5

    .line 237
    iget v0, v3, Landroid/graphics/Rect;->left:I

    iget v1, v4, Landroid/graphics/Point;->y:I

    mul-int/2addr v0, v1

    iget v1, v5, Landroid/graphics/Point;->x:I

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->left:I

    .line 238
    iget v0, v3, Landroid/graphics/Rect;->right:I

    iget v1, v4, Landroid/graphics/Point;->y:I

    mul-int/2addr v0, v1

    iget v1, v5, Landroid/graphics/Point;->x:I

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->right:I

    .line 239
    iget v0, v3, Landroid/graphics/Rect;->top:I

    iget v1, v4, Landroid/graphics/Point;->x:I

    mul-int/2addr v0, v1

    iget v1, v5, Landroid/graphics/Point;->y:I

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->top:I

    .line 240
    iget v0, v3, Landroid/graphics/Rect;->bottom:I

    iget v1, v4, Landroid/graphics/Point;->x:I

    mul-int/2addr v0, v1

    iget v1, v5, Landroid/graphics/Point;->y:I

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->bottom:I

    .line 242
    iput-object v3, p0, Lo/edg;->f:Landroid/graphics/Rect;

    .line 244
    :cond_1
    iget-object v0, p0, Lo/edg;->f:Landroid/graphics/Rect;

    return-object v0
.end method

.method public i()Landroid/graphics/Rect;
    .locals 11

    .line 173
    iget-object v0, p0, Lo/edg;->a:Lo/edc;

    invoke-virtual {v0}, Lo/edc;->d()Landroid/graphics/Point;

    move-result-object v6

    .line 174
    iget-object v0, p0, Lo/edg;->h:Landroid/graphics/Rect;

    if-nez v0, :cond_6

    .line 175
    iget-object v0, p0, Lo/edg;->g:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    .line 176
    const/4 v0, 0x0

    return-object v0

    .line 179
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 180
    const/4 v0, 0x0

    return-object v0

    .line 183
    :cond_1
    iget v0, v6, Landroid/graphics/Point;->x:I

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v7, v0, 0x4

    .line 184
    const/16 v0, 0x116

    if-ge v7, v0, :cond_2

    .line 185
    const/16 v7, 0x116

    goto :goto_0

    .line 186
    :cond_2
    const/16 v0, 0x2d0

    if-le v7, v0, :cond_3

    .line 187
    const/16 v7, 0x2d0

    .line 190
    :cond_3
    :goto_0
    iget v0, v6, Landroid/graphics/Point;->y:I

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v8, v0, 0x4

    .line 191
    const/16 v0, 0x116

    if-ge v8, v0, :cond_4

    .line 192
    const/16 v8, 0x116

    goto :goto_1

    .line 193
    :cond_4
    const/16 v0, 0x1e0

    if-le v8, v0, :cond_5

    .line 195
    move v8, v7

    .line 198
    :cond_5
    :goto_1
    iget v0, v6, Landroid/graphics/Point;->x:I

    sub-int/2addr v0, v7

    div-int/lit8 v9, v0, 0x2

    .line 199
    iget v0, v6, Landroid/graphics/Point;->y:I

    int-to-double v0, v0

    int-to-double v2, v8

    const-wide v4, 0x3ffe666666666666L    # 1.9

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    double-to-int v0, v0

    div-int/lit8 v10, v0, 0x2

    .line 200
    new-instance v0, Landroid/graphics/Rect;

    add-int v1, v9, v7

    add-int v2, v10, v8

    invoke-direct {v0, v9, v10, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lo/edg;->h:Landroid/graphics/Rect;

    .line 203
    :cond_6
    iget-object v0, p0, Lo/edg;->h:Landroid/graphics/Rect;

    return-object v0
.end method
