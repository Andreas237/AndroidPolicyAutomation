.class Lcom/shopkick/app/url/URLHandler$JSBuilder;
.super Ljava/lang/Object;
.source "URLHandler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/url/URLHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "JSBuilder"
.end annotation


# instance fields
.field builder:Ljava/lang/StringBuilder;

.field final synthetic this$0:Lcom/shopkick/app/url/URLHandler;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/url/URLHandler;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->this$0:Lcom/shopkick/app/url/URLHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/url/URLHandler;Lcom/shopkick/app/url/URLHandler$1;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/shopkick/app/url/URLHandler$JSBuilder;-><init>(Lcom/shopkick/app/url/URLHandler;)V

    return-void
.end method


# virtual methods
.method public addMethodName(Ljava/lang/String;)V
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    iget-object p1, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    const-string v0, "("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public addNullParam(Z)V
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const-string p1, ", "

    .line 139
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    const-string v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method public addObjectParam(Ljava/lang/Object;Z)V
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p2, ", "

    .line 130
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method public addStringParam(Ljava/lang/String;Z)V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const-string p2, ", "

    .line 119
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    iget-object p2, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    iget-object p1, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    const-string p2, "\""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method public endJS()V
    .locals 2

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    const-string v1, ")"

    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/url/URLHandler$JSBuilder;->builder:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 154
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
