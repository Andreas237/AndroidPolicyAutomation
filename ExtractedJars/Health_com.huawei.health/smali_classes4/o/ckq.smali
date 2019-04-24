.class public Lo/ckq;
.super Ljava/lang/Object;


# static fields
.field private static final c:Ljava/lang/Object;

.field private static e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/ckq;->c:Ljava/lang/Object;

    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/ckq;->e:Landroid/content/Context;

    return-void
.end method
