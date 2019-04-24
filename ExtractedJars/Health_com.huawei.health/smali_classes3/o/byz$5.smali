.class Lo/byz$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bzc$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/byz;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/byz;


# direct methods
.method constructor <init>(Lo/byz;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lo/byz$5;->b:Lo/byz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)Ljava/lang/String;
    .locals 1

    .line 97
    rem-int/lit8 v0, p1, 0x3c

    invoke-static {v0}, Lo/bze;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 92
    const v0, 0xea60

    return v0
.end method
