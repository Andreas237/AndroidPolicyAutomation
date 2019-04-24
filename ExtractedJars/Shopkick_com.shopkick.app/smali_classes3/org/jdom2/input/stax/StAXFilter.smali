.class public interface abstract Lorg/jdom2/input/stax/StAXFilter;
.super Ljava/lang/Object;
.source "StAXFilter.java"


# virtual methods
.method public abstract includeCDATA(ILjava/lang/String;)Ljava/lang/String;
.end method

.method public abstract includeComment(ILjava/lang/String;)Ljava/lang/String;
.end method

.method public abstract includeDocType()Z
.end method

.method public abstract includeElement(ILjava/lang/String;Lorg/jdom2/Namespace;)Z
.end method

.method public abstract includeEntityRef(ILjava/lang/String;)Z
.end method

.method public abstract includeProcessingInstruction(ILjava/lang/String;)Z
.end method

.method public abstract includeText(ILjava/lang/String;)Ljava/lang/String;
.end method

.method public abstract pruneCDATA(ILjava/lang/String;)Ljava/lang/String;
.end method

.method public abstract pruneComment(ILjava/lang/String;)Ljava/lang/String;
.end method

.method public abstract pruneElement(ILjava/lang/String;Lorg/jdom2/Namespace;)Z
.end method

.method public abstract pruneEntityRef(ILjava/lang/String;)Z
.end method

.method public abstract pruneProcessingInstruction(ILjava/lang/String;)Z
.end method

.method public abstract pruneText(ILjava/lang/String;)Ljava/lang/String;
.end method
