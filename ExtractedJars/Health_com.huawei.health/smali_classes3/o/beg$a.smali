.class Lo/beg$a;
.super Lo/beu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/beg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Landroid/widget/TextView;

.field d:Landroid/widget/ImageView;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 367
    invoke-direct {p0}, Lo/beu;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/beg$2;)V
    .locals 0

    .line 367
    invoke-direct {p0}, Lo/beg$a;-><init>()V

    return-void
.end method
