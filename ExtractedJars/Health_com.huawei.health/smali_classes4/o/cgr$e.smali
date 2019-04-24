.class Lo/cgr$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field public e:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 543
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 544
    iput p1, p0, Lo/cgr$e;->e:I

    .line 545
    iput-object p2, p0, Lo/cgr$e;->b:Ljava/lang/String;

    .line 546
    iput-object p3, p0, Lo/cgr$e;->c:Ljava/lang/String;

    .line 547
    return-void
.end method

.method public constructor <init>(ILjava/util/Map$Entry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 538
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 539
    iput-object p2, p0, Lo/cgr$e;->d:Ljava/util/Map$Entry;

    .line 540
    iput p1, p0, Lo/cgr$e;->e:I

    .line 541
    return-void
.end method
