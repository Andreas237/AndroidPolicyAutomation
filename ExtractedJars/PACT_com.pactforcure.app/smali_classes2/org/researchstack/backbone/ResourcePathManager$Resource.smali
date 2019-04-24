.class public Lorg/researchstack/backbone/ResourcePathManager$Resource;
.super Ljava/lang/Object;
.source "ResourcePathManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/ResourcePathManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Resource"
.end annotation


# static fields
.field public static final TYPE_HTML:I = 0x0

.field public static final TYPE_JSON:I = 0x1

.field public static final TYPE_MP4:I = 0x3

.field public static final TYPE_PDF:I = 0x2


# instance fields
.field private clazz:Ljava/lang/Class;

.field private final dir:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final type:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "type"    # I
    .param p2, "dir"    # Ljava/lang/String;
    .param p3, "name"    # Ljava/lang/String;

    .prologue
    .line 240
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/researchstack/backbone/ResourcePathManager$Resource;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V

    .line 241
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V
    .locals 0
    .param p1, "type"    # I
    .param p2, "dir"    # Ljava/lang/String;
    .param p3, "name"    # Ljava/lang/String;
    .param p4, "clazz"    # Ljava/lang/Class;

    .prologue
    .line 252
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 253
    iput p1, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->type:I

    .line 254
    iput-object p2, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->dir:Ljava/lang/String;

    .line 255
    iput-object p3, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->name:Ljava/lang/String;

    .line 256
    iput-object p4, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->clazz:Ljava/lang/Class;

    .line 257
    return-void
.end method


# virtual methods
.method public create(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 298
    invoke-virtual {p0}, Lorg/researchstack/backbone/ResourcePathManager$Resource;->getRelativePath()Ljava/lang/String;

    move-result-object v0

    .line 299
    .local v0, "path":Ljava/lang/String;
    iget-object v1, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->clazz:Ljava/lang/Class;

    invoke-static {p1, v1, v0}, Lorg/researchstack/backbone/ResourcePathManager;->getResourceAsClass(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public getAbsolutePath()Ljava/lang/String;
    .locals 2

    .prologue
    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "file:///android_asset/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/researchstack/backbone/ResourcePathManager$Resource;->getRelativePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDir()Ljava/lang/String;
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->dir:Ljava/lang/String;

    return-object v0
.end method

.method public getFileExtension()Ljava/lang/String;
    .locals 2

    .prologue
    .line 347
    invoke-static {}, Lorg/researchstack/backbone/ResourcePathManager;->getInstance()Lorg/researchstack/backbone/ResourcePathManager;

    move-result-object v0

    iget v1, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->type:I

    invoke-virtual {v0, v1}, Lorg/researchstack/backbone/ResourcePathManager;->getFileExtension(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 276
    iget-object v0, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getRelativePath()Ljava/lang/String;
    .locals 3

    .prologue
    .line 331
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 332
    .local v0, "path":Ljava/lang/StringBuilder;
    iget-object v1, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->dir:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 334
    iget-object v1, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->dir:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    :cond_0
    iget-object v1, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lorg/researchstack/backbone/ResourcePathManager$Resource;->getFileExtension()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public getType()I
    .locals 1

    .prologue
    .line 286
    iget v0, p0, Lorg/researchstack/backbone/ResourcePathManager$Resource;->type:I

    return v0
.end method

.method public open(Landroid/content/Context;)Ljava/io/InputStream;
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 310
    invoke-virtual {p0}, Lorg/researchstack/backbone/ResourcePathManager$Resource;->getRelativePath()Ljava/lang/String;

    move-result-object v0

    .line 311
    .local v0, "path":Ljava/lang/String;
    invoke-static {p1, v0}, Lorg/researchstack/backbone/ResourcePathManager;->getResouceAsInputStream(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    return-object v1
.end method
