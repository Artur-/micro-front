import { html, css, LitElement } from 'lit-element/lit-element';

class ProductImage extends LitElement {
    static get properties() {
        return {
            "product": Array
        }
    }
    static get styles() {
        return css`
        :host {
            display: inline-block;
        }
        div {
            border: 1px solid red;
        }
        img {
            width: 100%;
        }
        `;
    }
    render() {
        return html`<div style="border-bottom: 1px solid black">
        Implemented using LitElement in product-image.js and deployed as /product-image/product-image.js<br>
        <img src="${this.product ? this.product.image : ""}">
        </div>`;
    }
}

customElements.define("product-image", ProductImage);