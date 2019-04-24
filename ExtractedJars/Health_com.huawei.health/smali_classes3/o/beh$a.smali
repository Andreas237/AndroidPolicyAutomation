.class Lo/beh$a;
.super Lo/beu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/beh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field c:Landroid/widget/TextView;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 112
    invoke-direct {p0}, Lo/beu;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/beh$4;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Lo/beh$a;-><init>()V

    return-void
.end method
