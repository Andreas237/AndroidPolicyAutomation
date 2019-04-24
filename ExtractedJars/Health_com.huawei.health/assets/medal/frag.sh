precision mediump float;
uniform sampler2D sTexture;//纹理内容数据

varying vec2 vTextureCoord;

varying vec4 vAmbient;//接收从顶点着色器过来的环境光分量
varying vec4 vDiffuse;//接收从顶点着色器过来的散射光分量
varying vec4 vSpecular;//接收从顶点着色器过来的镜面反射光分量

varying float vIsBg;//是否是背面
uniform float vContent ;

varying vec4 vAmbient2;			//接收从顶点着色器过来的环境光分量
varying vec4 vDiffuse2;			//接收从顶点着色器过来的散射光分量
varying vec4 vSpecular2;			//接收从顶点着色器过来的镜面反射光分量

uniform mat4 uMVPMatrixGY;
uniform sampler2D sLightImg;
varying vec4 vPosition;  			//接收从顶点着色器传递过来的片元位置
varying vec4 vFont1Specular;
varying vec4 vFont2Specular;

void main()
{
    //将计算出的颜色给此片元
    vec4 finalBase=texture2D(sTexture, vTextureCoord);
    //给此片元颜色值
    vec4 finalColor=vec4((finalBase*vAmbient+finalBase*vDiffuse + finalBase*vSpecular).xyz,1.0);
    finalColor+=vec4((finalBase*vAmbient2+finalBase*vDiffuse2 + finalBase*vSpecular2).xyz,1.0);

    if(vIsBg>0.5){//font and icon
        //将片元的位置投影到光源处虚拟摄像机的近平面上
        vec4 gytyPosition=uMVPMatrixGY * vec4(vPosition.xyz,1);
        gytyPosition=gytyPosition/gytyPosition.w;	//进行透视除法
        float s=gytyPosition.s+0.5;
        float t=gytyPosition.t+0.5;
        vec4 backFontBaseColor=vec4(0.0);
        if(s>=0.0&&s<=1.0&&t>=0.0&&t<=1.0){
            backFontBaseColor=texture2D(sLightImg, vec2(s,1.0-t));
        }
        if(vContent == 0.0){
            backFontBaseColor=vec4(0.0);
        }
        vec3 backFontFinalColor=vec3(backFontBaseColor.rgb*vDiffuse.rgb*2.0+vec3(1.0)*vFont1Specular.rgb*2.0*backFontBaseColor.a);
        backFontFinalColor+=vec3(backFontBaseColor.rgb*vDiffuse2.rgb*2.0+ vec3(1.0)*vFont2Specular.rgb*2.0*backFontBaseColor.a);
        gl_FragColor=finalColor*(1.0-backFontBaseColor.a)+vec4(backFontFinalColor,backFontBaseColor.a);
    }else{
        gl_FragColor=finalColor;
    }
}