.class public Lo/bkr$c;
.super Lo/bfh;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bkr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 82
    invoke-direct {p0}, Lo/bfh;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lo/bkr$c;->e:Ljava/lang/String;

    .line 97
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lo/bkr$c;->e:Ljava/lang/String;

    return-object v0
.end method
