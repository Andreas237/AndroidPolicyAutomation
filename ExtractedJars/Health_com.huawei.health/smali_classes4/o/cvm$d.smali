.class Lo/cvm$d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cvm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field e:Lo/cvm$b;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lo/cvm$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/cvm$d;->a:Ljava/lang/String;

    iput-object p2, p0, Lo/cvm$d;->b:Ljava/lang/String;

    iput-object p3, p0, Lo/cvm$d;->e:Lo/cvm$b;

    return-void
.end method
