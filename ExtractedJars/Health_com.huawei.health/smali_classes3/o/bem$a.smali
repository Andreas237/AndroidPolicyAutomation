.class Lo/bem$a;
.super Lo/beu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field b:Landroid/widget/TextView;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 181
    invoke-direct {p0}, Lo/beu;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/bem$2;)V
    .locals 0

    .line 181
    invoke-direct {p0}, Lo/bem$a;-><init>()V

    return-void
.end method
