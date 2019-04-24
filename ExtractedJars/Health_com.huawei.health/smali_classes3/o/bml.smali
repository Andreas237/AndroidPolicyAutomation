.class public Lo/bml;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bml$b;
    }
.end annotation


# static fields
.field private static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 83
    const-class v0, Lo/bml;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bml;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lo/bml$b;)V
    .locals 0

    .line 410
    return-void
.end method

.method public static b(Landroid/content/Context;Lo/bml$b;)Z
    .locals 1

    .line 570
    const/4 v0, 0x0

    return v0
.end method

.method private static c(Landroid/content/Context;Lo/bml$b;)V
    .locals 0

    .line 259
    return-void
.end method

.method public static d(Landroid/content/Context;Lo/bml$b;)V
    .locals 1

    .line 181
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 183
    :cond_0
    return-void

    .line 185
    :cond_1
    invoke-static {}, Lo/bml;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 187
    invoke-static {p0, p1}, Lo/bml;->e(Landroid/content/Context;Lo/bml$b;)V

    goto :goto_0

    .line 191
    :cond_2
    invoke-static {p0, p1}, Lo/bml;->c(Landroid/content/Context;Lo/bml$b;)V

    .line 193
    :goto_0
    return-void
.end method

.method private static e(Landroid/content/Context;Lo/bml$b;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 345
    return-void
.end method

.method public static e()Z
    .locals 2

    .line 202
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
