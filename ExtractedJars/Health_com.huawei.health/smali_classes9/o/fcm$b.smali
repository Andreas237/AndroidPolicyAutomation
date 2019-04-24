.class Lo/fcm$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fcm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Landroid/widget/TextView;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fcm$2;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lo/fcm$b;-><init>()V

    return-void
.end method

.method static synthetic d(Lo/fcm$b;)Landroid/widget/TextView;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/fcm$b;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lo/fcm$b;Landroid/widget/TextView;)Landroid/widget/TextView;
    .locals 0

    .line 75
    iput-object p1, p0, Lo/fcm$b;->c:Landroid/widget/TextView;

    return-object p1
.end method
