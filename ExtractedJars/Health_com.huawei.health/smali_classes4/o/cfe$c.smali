.class Lo/cfe$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cfe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field a:I

.field e:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    .line 909
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 910
    iput p1, p0, Lo/cfe$c;->e:I

    .line 911
    iput p2, p0, Lo/cfe$c;->a:I

    .line 912
    return-void
.end method
