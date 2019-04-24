.class Lo/ejw$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ejw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Lo/ehe$a;

.field c:Lo/ejk;

.field d:Lo/eic;


# direct methods
.method constructor <init>(Lo/eic;Lo/ehe$a;Lo/ejk;)V
    .locals 0

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p1, p0, Lo/ejw$a;->d:Lo/eic;

    .line 111
    iput-object p2, p0, Lo/ejw$a;->a:Lo/ehe$a;

    .line 112
    iput-object p3, p0, Lo/ejw$a;->c:Lo/ejk;

    .line 113
    return-void
.end method
