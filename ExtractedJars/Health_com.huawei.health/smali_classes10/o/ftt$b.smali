.class Lo/ftt$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ftt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final d:Lo/ftt$e;

.field final e:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>(Ljava/util/regex/Pattern;Lo/ftt$e;)V
    .locals 0

    .line 397
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 398
    iput-object p1, p0, Lo/ftt$b;->e:Ljava/util/regex/Pattern;

    .line 399
    iput-object p2, p0, Lo/ftt$b;->d:Lo/ftt$e;

    .line 400
    return-void
.end method
