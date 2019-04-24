.class public Lo/cjl;
.super Ljava/lang/Object;


# instance fields
.field private c:Ljava/lang/String;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lo/cjl;->e:I

    iput-object p2, p0, Lo/cjl;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lo/cjl;->e:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/cjl;->c:Ljava/lang/String;

    return-object v0
.end method
