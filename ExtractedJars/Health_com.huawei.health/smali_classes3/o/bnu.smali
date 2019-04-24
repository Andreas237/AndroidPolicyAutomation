.class public Lo/bnu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()Ljava/lang/String;
    .locals 1

    .line 88
    const-string v0, "/data/skin/fonts"

    return-object v0
.end method

.method public static b(Landroid/widget/TextView;)V
    .locals 2

    .line 54
    invoke-static {}, Lo/bnu;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bnu;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/bom;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 56
    sget-object v0, Lo/bnu;->e:Landroid/graphics/Typeface;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 58
    const-string v0, "/system/fonts/slim.ttf"

    invoke-static {v0}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lo/bnu;->e:Landroid/graphics/Typeface;

    .line 60
    :cond_0
    sget-object v0, Lo/bnu;->e:Landroid/graphics/Typeface;

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 62
    :cond_1
    return-void
.end method

.method private static b()Z
    .locals 4

    .line 70
    invoke-static {}, Lo/bnu;->a()Ljava/lang/String;

    move-result-object v1

    .line 71
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 75
    const/4 v0, 0x1

    return v0

    .line 78
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v3

    .line 79
    if-eqz v3, :cond_1

    array-length v0, v3

    if-nez v0, :cond_2

    .line 81
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 84
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private static c()Z
    .locals 3

    .line 112
    invoke-static {}, Lo/bnu;->d()Ljava/lang/String;

    move-result-object v1

    .line 113
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method private static d()Ljava/lang/String;
    .locals 1

    .line 118
    const-string v0, "/system/fonts/slim.ttf"

    return-object v0
.end method
