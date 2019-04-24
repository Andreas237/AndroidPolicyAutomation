.class public interface abstract Lcom/shopkick/comm/IAPIEndpoint;
.super Ljava/lang/Object;
.source "IAPIEndpoint.java"


# virtual methods
.method public abstract getAuthenticationType()I
.end method

.method public abstract getDomain()Ljava/lang/String;
.end method

.method public abstract getPath()Ljava/lang/String;
.end method

.method public abstract getResponseClass()Ljava/lang/String;
.end method

.method public abstract modifiesSession()Z
.end method

.method public abstract useHttps()Z
.end method

.method public abstract usePost()Z
.end method
